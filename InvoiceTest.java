//Ex 12
package company;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i1 = new Invoice("1111", "Tools", 1, 12);
        Invoice i2 = new Invoice("1112", "Hammer", 2, 32);
        Invoice i3 = new Invoice("1113", "Rope", 1, -10);
        Invoice i4 = new Invoice("1114", "Cable", 0, 19);

        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                i1.getNumber(), i1.getDescription(), i1.getQuantity(), i1.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                i2.getNumber(), i2.getDescription(), i2.getQuantity(), i2.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                i3.getNumber(), i3.getDescription(), i3.getQuantity(), i3.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                i4.getNumber(), i4.getDescription(), i4.getQuantity(), i4.getPrice());

        System.out.printf("%nTotal price of invoice %s: $%.2f",
                i1.getNumber(), i1.getInvoiceAmount(i1.getQuantity(), i1.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                i2.getNumber(), i2.getInvoiceAmount(i2.getQuantity(), i2.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                i3.getNumber(), i3.getInvoiceAmount(i3.getQuantity(), i3.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                i4.getNumber(), i4.getInvoiceAmount(i4.getQuantity(), i4.getPrice()));


    }
    }
