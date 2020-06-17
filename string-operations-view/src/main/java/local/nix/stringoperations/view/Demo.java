package local.nix.stringoperations.view;


import local.nix.stringoperations.view.handler.OperationHandler;
import local.nix.stringoperations.view.viewer.ConsoleViewer;
import local.nix.stringoperations.view.viewer.FileViewer;
import local.nix.stringoperations.view.viewer.StringOperationsUtilViewer;

import java.io.*;


public class Demo {

    public static void main(String[] args) {

        StringOperationsUtilViewer viewer = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("1. Подсчет всех символов и сортировка по порядку количества встречаний");
            System.out.println("2. Подсчет всех слов и сортировка по порядку количества встречаний");
            System.out.println("3. Реверс всех слов");
            System.out.println("Введите номер операции, которую хотите совершить с текстом:");
            String number = br.readLine();
            int numberOfOperation = Integer.parseInt(number);

            if(numberOfOperation < 0 || numberOfOperation > 3) {
                System.out.println("Неправильно введен номер операции");
            } else {

                System.out.println("1. В консоль");
                System.out.println("2. В файл result.txt");
                System.out.println("Введите номер, куда вывести данные");
                String number1 = br.readLine();
                int numberOfOutputGettingWay = Integer.parseInt(number1);

                if(numberOfOutputGettingWay < 0 || numberOfOutputGettingWay > 2) {
                    System.out.println("Неправильно введен номер, куда выводить данные");
                } else {

                    if(numberOfOutputGettingWay == 1) {
                        viewer = new ConsoleViewer();
                    } else {
                        viewer = new FileViewer();
                    }
                }

                OperationHandler.handleOperation(viewer, numberOfOperation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
