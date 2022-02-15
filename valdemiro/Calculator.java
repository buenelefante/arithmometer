package com.valdemiro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static void main(String[] args) throws IOException {
        String text = """
                        Введите выражение в формате: число знак число.
                        Пробелы между цифрами и знаком обязательны.
                        Можно использовать арабские или римские цифры
                        в одном выражении.   От единицы до десяти.
                        """;
        System.out.println(text);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        try {
            List<String> roll = new ArrayList<String>(Arrays.asList(input.split(" ", 3)));
            Basic.inp(roll.get(0), roll.get(1), roll.get(2));
        } catch (Exception e) {
            System.out.println("неверные данные, попробуй еще");
        }
        System.exit(0);
    }
}
