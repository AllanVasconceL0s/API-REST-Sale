package com.bidweb.API_REST_Sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestSaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestSaleApplication.class, args);
        System.out.println("\n========================================");
        System.out.println("🚀 Sistema de Vendas iniciado com sucesso!");
        System.out.println("📊 API disponível em: http://localhost:8080/api");
        System.out.println("🗄️  H2 Console: http://localhost:8080/api/h2-console");
        System.out.println("👤 Usuários padrão:");
        System.out.println("   - admin / senha123");
        System.out.println("   - user / 123456");
        System.out.println("========================================\n");
    }
}
