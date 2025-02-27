package ContactList;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String mynumber;
    ArrayList<Contact> myContacts;


    public MobilePhone(String mynumber) {
        this.mynumber = mynumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) > 0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position < 0) {
            return false;
        }
        myContacts.set(position,newContact);
        return true;
    }
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            return false;
        }
        myContacts.remove(position);
        return true;

    }
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String name ){
        for (int i = 0; i <myContacts.size() ; i++) {
            if (myContacts.get(i).getName().equals(name)){
                return i;
            }

        }
        return -1;
    }
    public Contact queryContact(String name ){
        int position = findContact(name);
        if (position  >= 0 ) {
            return myContacts.get(position);
        }
        return null;
    }
    public void printContact(){
        System.out.println("Lista de Contato");
        for (int i = 0; i <myContacts.size() ; i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

}

class testes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone myPhone = new MobilePhone("8390023490");

        while (true){
            System.out.println("\n1 - Adicionar Contato\n2 - Atualizar Contato\n3 - Remover Contato\n4 - Buscar Contato\n5 - Mostrar Contatos\n0 - Sair");
            int opition = scanner.nextInt();
            scanner.nextLine();
            if (opition == 0) {
                break;
            }
            switch (opition) {
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Numero: ");
                    String number = scanner.nextLine();
                    Contact newContact = Contact.CraatContact(name, number);
                    if (myPhone.addNewContact(newContact)) {
                        System.out.println("Contato Adicionado!");
                    } else {
                        System.out.println("Contato ja existe na sua lista");
                    }
                    break;
                case 2:
                    System.out.println("Nome do contato a ser Atualizado: ");
                    String oldName = scanner.nextLine();
                    Contact existingContact = myPhone.queryContact(oldName);
                    if (existingContact == null) {
                        System.out.println("Contato nao encontrado ou nao Existe");
                        break;
                    }
                    System.out.println("Novo nome: ");
                    String newName = scanner.nextLine();
                    System.out.println("Novo numero: ");
                    String newNumber = scanner.nextLine();
                    Contact updateContact = Contact.CraatContact(newName, newNumber);
                    if (myPhone.updateContact(existingContact, updateContact)) {
                        System.out.println("Parabens o Contato foi Atualizado");

                    } else {
                        System.out.println("Erro ao atualizar contato. ");

                    }
                    break;
                case 3:
                    System.out.println("Nome do contato a ser Removido: ");
                    String removeName = scanner.nextLine();
                    Contact removeContact = myPhone.queryContact(removeName);
                    if (removeContact == null) {
                        System.out.println("Contato nao encontrado ou nao Existe");
                        break;
                    }
                    if (myPhone.removeContact(removeContact)) {
                        System.out.println("Contato removido");
                    } else {
                        System.out.println("Erro ao remover contato");
                    }
                    break;
                case 4:
                    System.out.println("Nome do contato ou numero pra ser buscado");
                    String searchName = scanner.nextLine();
                    Contact searchContact = myPhone.queryContact(searchName);
                    if (searchContact != null) {
                        System.out.println("Nome: " + searchContact.getName() +
                                " | Numero: " + searchContact.getPhoneNumber());
                    } else {
                        System.out.println("Contato Nao Encontrado");
                    }
                    break;

                case 5:
                    myPhone.printContact();
                    break;
                default:
                    System.out.println("Opcao Invalida. ");
            }
        }
        scanner.close();
    }
}


