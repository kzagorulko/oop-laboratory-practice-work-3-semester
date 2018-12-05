package ru.zagorulko.praqSeven;

import java.util.*;

class main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> deque2 = new ArrayDeque<Integer>();

        Scanner insc = new Scanner(System.in);

        Scanner sc = new Scanner(insc.nextLine());

        for (int i = 0; i < 5; i++) {
            deque1.addLast(sc.nextInt());
        }

        sc = new Scanner(insc.nextLine());

        for (int i = 0; i < 5; i++) {
            deque2.addLast(sc.nextInt());
        }

        for (int i = 0; i < 106; i++) {
            if (deque1.isEmpty()) {
                System.out.printf("Второй " + i);
                return;
            }

            if (deque2.isEmpty()) {
                System.out.printf("Первый " + i);
                return;
            }

            int card1 = deque1.pop();
            int card2 = deque2.pop();

            ArrayDeque<Integer> winner = ((card1 == 0 && card2 == 9) ||
                    (card1 > card2 && (card1 != 9 || card2 != 0))) ? deque1 : deque2;

            winner.addLast(card1);
            winner.addLast(card2);
        }
    System.out.println("Ботва");
    }
}
