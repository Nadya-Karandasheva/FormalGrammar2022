import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] symbols = s.toCharArray();
        boolean status = false;
        int currentState = 1;
        for (int i = 0; i < s.length(); i++) {
            switch (currentState) {
                case 1: {
                    switch (symbols[i]) {
                        case 'a': {
                            currentState = 2;
                            break;
                        }
                        case 'b':
                        case 'c': {
                            status = false;
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (symbols[i]) {
                        case 'b': {
                            currentState = 3;
                            break;
                        }
                        case 'a':
                        case 'c': {
                            status = false;
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (symbols[i]) {
                        case 'a': {
                            currentState = 4;
                            break;
                        }
                        case 'c': {
                            currentState = 5;
                            status = true;
                            break;
                        }
                        case 'b': {
                            status = false;
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    switch (symbols[i]) {
                        case 'b':
                        case 'c': {
                            currentState = 3;
                            break;
                        }
                        case 'a': {
                            status = false;
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    switch (symbols[i]) {
                        case 'a':
                        case 'b':
                        case 'c': {
                            status = false;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(status);
    }
}
