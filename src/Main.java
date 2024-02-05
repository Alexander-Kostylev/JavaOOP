import Employee.Doctor;
import Employee.Nurse;
import Employee.Employee;
import Patients.*;
import VeterinaryClinic.Operation;
import clients.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Animal cat = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
//                LocalDate.of(2021, 10, 05), new Illness("Лишай"), 10.0); //Создаём экземпляр класса
//
//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickName());
//        System.out.println("Болезнь:" + cat.getIllness());
//
//        System.out.println(cat.getNickName());
//
//        cat.setIllness(new Illness(null));
//
//        System.out.println("Болезнь:" + cat.getIllness());
//
//
//        Animal catty = new Cat();
//        Dog goodBoy = new Dog();
//
//        System.out.println(goodBoy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(catty);
//
//        Cat.meow();
//
//        List<Animal> animals = new ArrayList<Animal>();
//
//        animals.add(catty);
//        animals.add(goodBoy);
//        animals.add(cat);
//
//        int i = 0;
//        for (Animal animal : animals){
//            System.out.println(i + " "+ animal);
//            i++;
//        }
//
        Doctor doc1 = new Doctor();
        Doctor doc2 = new Doctor();
        Employee nusre1 = new Nurse();
        Employee nusre2 = new Nurse();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Animal dog1 = new Dog();
        Animal peng1 = new Penguin();


        Operation operation = new Operation(doc1, LocalDate.now(), cat1);

        operation.getOperation();

        List<Employee> employees = new ArrayList<>();

        employees.add(doc1);
        employees.add(doc2);
        employees.add(nusre1);
        employees.add(nusre2);


        List<Animal> patients = new ArrayList<>();

        patients.add(cat1);
        patients.add(dog1);
        patients.add(peng1);
        patients.add(cat2);

        

        System.out.printf("Всего в больнице рабоет %s сотрудника\n", employees.size());

        System.out.printf("Cейчас в больнице находятся %s животных\n", patients.size());
    }
}