package com.example.Store;

import com.example.Store.modelos.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		Usuario objeto = new Usuario();

		Scanner leer = new Scanner(System.in);

		System.out.println("Digite su nombre: ");
		objeto.setNombres(leer.nextLine());

	}

}
