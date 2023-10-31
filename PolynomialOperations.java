import java.util.Scanner;

class Term {
    int coefficient;
    int exponent;
    Term next;

    Term(int coeff, int exp) {
        coefficient = coeff;
        exponent = exp;
        next = null;
    }
}

class Polynomial {
    Term head;

    void insertTerm(int coeff, int exp) {
        Term newTerm = new Term(coeff, exp);
        if (head == null) {
            head = newTerm;
        } else {
            Term current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTerm;
        }
    }

    Polynomial add(Polynomial other) {
        Polynomial result = new Polynomial();
        Term current1 = this.head;
        Term current2 = other.head;

        while (current1 != null && current2 != null) {
            if (current1.exponent > current2.exponent) {
                result.insertTerm(current1.coefficient, current1.exponent);
                current1 = current1.next;
            } else if (current1.exponent < current2.exponent) {
                result.insertTerm(current2.coefficient, current2.exponent);
                current2 = current2.next;
            } else {
                int sumCoeff = current1.coefficient + current2.coefficient;
                if (sumCoeff != 0) {
                    result.insertTerm(sumCoeff, current1.exponent);
                }
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            result.insertTerm(current1.coefficient, current1.exponent);
            current1 = current1.next;
        }

        while (current2 != null) {
            result.insertTerm(current2.coefficient, current2.exponent);
            current2 = current2.next;
        }

        return result;
    }

    Polynomial subtract(Polynomial other) {
        Polynomial result = new Polynomial();
        Term current1 = this.head;
        Term current2 = other.head;

        while (current1 != null && current2 != null) {
            if (current1.exponent > current2.exponent) {
                result.insertTerm(current1.coefficient, current1.exponent);
                current1 = current1.next;
            } else if (current1.exponent < current2.exponent) {
                result.insertTerm(-current2.coefficient, current2.exponent);
                current2 = current2.next;
            } else {
                int diffCoeff = current1.coefficient - current2.coefficient;
                if (diffCoeff != 0) {
                    result.insertTerm(diffCoeff, current1.exponent);
                }
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            result.insertTerm(current1.coefficient, current1.exponent);
            current1 = current1.next;
        }

        while (current2 != null) {
            result.insertTerm(-current2.coefficient, current2.exponent);
            current2 = current2.next;
        }

        return result;
    }

    Term findHighestTerm() {
        Term highestTerm = head;
        Term current = head;

        while (current != null) {
            if (current.coefficient > highestTerm.coefficient ||
                (current.coefficient == highestTerm.coefficient && current.exponent > highestTerm.exponent)) {
                highestTerm = current;
            }
            current = current.next;
        }

        return highestTerm;
    }

    void print() {
        Term current = head;
        if (current == null) {
            System.out.println("0");
        } else {
            while (current != null) {
                System.out.print(current.coefficient + "x^" + current.exponent);
                current = current.next;
                if (current != null) {
                    if (current.coefficient >= 0) {
                        System.out.print(" + ");
                    } else {
                        System.out.print(" - ");
                    }
                }
            }
            System.out.println();
        }
    }
}

public class PolynomialOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        // Input for the first polynomial
        System.out.print("Enter the number of terms in the first polynomial: ");
        int numTerms1 = scanner.nextInt();
        for (int i = 0; i < numTerms1; i++) {
            System.out.print("Enter coefficient and exponent for term " + (i + 1) + ": ");
            int coeff = scanner.nextInt();
            int exp = scanner.nextInt();
            poly1.insertTerm(coeff, exp);
        }

        // Input for the second polynomial
        System.out.print("Enter the number of terms in the second polynomial: ");
        int numTerms2 = scanner.nextInt();
        for (int i = 0; i < numTerms2; i++) {
            System.out.print("Enter coefficient and exponent for term " + (i + 1) + ": ");
            int coeff = scanner.nextInt();
            int exp = scanner.nextInt();
            poly2.insertTerm(coeff, exp);
        }

        System.out.print("First polynomial: ");
        poly1.print();

        System.out.print("Second polynomial: ");
        poly2.print();

        Polynomial result;

        // Addition
        result = poly1.add(poly2);
        System.out.print("Result of addition: ");
        result.print();

        // Subtraction: poly1 - poly2
        result = poly1.subtract(poly2);
        System.out.print("Result of subtraction (poly1 - poly2): ");
        result.print();

        // Subtraction: poly2 - poly1
        result = poly2.subtract(poly1);
        System.out.print("Result of subtraction (poly2 - poly1): ");
        result.print();

        // Find the term with the highest coefficient/exponent in both polynomials
        Term highestTerm1 = poly1.findHighestTerm();
        Term highestTerm2 = poly2.findHighestTerm();

        System.out.println("Term with highest coefficient/exponent in first polynomial: " +
                highestTerm1.coefficient + "x^" + highestTerm1.exponent);
        System.out.println("Term with highest coefficient/exponent in second polynomial: " +
                highestTerm2.coefficient + "x^" + highestTerm2.exponent);

        scanner.close();
    }
}



