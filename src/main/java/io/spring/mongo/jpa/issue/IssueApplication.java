package io.spring.mongo.jpa.issue;

import io.spring.mongo.jpa.issue.jpa.inheritance.ShopperRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableJpaRepositories
@EnableMongoRepositories
public class IssueApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IssueApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        printInheritedTypes(ShopperRepository.class);
    }
    public static void printInheritedTypes(Class clazz) {
        System.out.println("Class: " + clazz.getName());

        System.out.println("Superclasses:");
        Class<?> current = clazz.getSuperclass();
        while (current != null) {
            System.out.println("  - " + current.getName());
            current = current.getSuperclass();
        }

        System.out.println("Interfaces (direct and inherited):");
        java.util.Set<Class<?>> seen = new java.util.LinkedHashSet<>();
        current = clazz;
        while (current != null) {
            for (Class<?> itf : current.getInterfaces()) {
                collectInterfacesRecursive(itf, seen);
            }
            current = current.getSuperclass();
        }
        for (Class<?> itf : seen) {
            System.out.println("  - " + itf.getName());
        }
    }

    private static void collectInterfacesRecursive(Class<?> itf, java.util.Set<Class<?>> seen) {
        if (seen.add(itf)) {
            for (Class<?> parent : itf.getInterfaces()) {
                collectInterfacesRecursive(parent, seen);
            }
        }
    }
}
