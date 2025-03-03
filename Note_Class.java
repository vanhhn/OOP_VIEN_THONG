import java.util.ArrayList;
import java.util.Scanner;

class taiKhoan {
    private String id;
    private String name;
    private ArrayList<String> ghiChu;

    public taiKhoan(int id, String name) {
        this.id = String.format("%03d", id);
        this.name = name;
        this.ghiChu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void themGhiChu(String s) {
        this.ghiChu.add(s);
    }

    public void chiaSeGhiChu(taiKhoan x, int id) {
        x.ghiChu.add(this.ghiChu.get(id));
    }

    public int getSoLuongGhiChu() {
        return ghiChu.size();
    }

    public String toString() {
        String res = "Account: " + this.name + "\n";
        for (String gc : this.ghiChu) {
            res += gc + "\n";
        }
        return res.trim();
    }
}

public class Note_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<taiKhoan> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            arr.add(new taiKhoan(i, s));
        }

        int ok = 0;
        while (sc.hasNextLine()) {
            String q = sc.nextLine().trim();
            if (q.isEmpty()) continue;
            String[] ar = q.split("\\s+");
            if (ar.length < 2) {
                ok = 1;
                break;
            }

            String operation = ar[1];
            try {
                if (operation.equals("Add")) {
                    if (ar.length < 3) {
                        ok = 1;
                        break;
                    }
                    int userId = Integer.parseInt(ar[0]);
                    if (userId < 1 || userId > arr.size()) {
                        ok = 1;
                        break;
                    }
                    String date = ar[2];
                    if (date.length() != 7) {
                        ok = 1;
                        break;
                    }
                    StringBuilder content = new StringBuilder();
                    content.append(date.substring(3, 5)).append(" ")
                           .append(date.substring(0, 3)).append(" ")
                           .append(date.substring(5, 7)).append(" | ");
                    for (int i = 3; i < ar.length; i++) {
                        content.append(ar[i]).append(" ");
                    }
                    arr.get(userId - 1).themGhiChu(content.toString().trim());
                } else if (operation.equals("Share")) {
                    if (ar.length < 4) {
                        ok = 1;
                        break;
                    }
                    int sourceId = Integer.parseInt(ar[0]);
                    int targetId = Integer.parseInt(ar[2]);
                    int noteId = Integer.parseInt(ar[3]);
                    if (sourceId < 1 || sourceId > arr.size() || 
                        targetId < 1 || targetId > arr.size()) {
                        ok = 1;
                        break;
                    }
                    taiKhoan source = arr.get(sourceId - 1);
                    taiKhoan target = arr.get(targetId - 1);
                    if (noteId < 1 || noteId > source.getSoLuongGhiChu()) {
                        ok = 1;
                        break;
                    }
                    source.chiaSeGhiChu(target, noteId - 1);
                } else {
                    ok = 1;
                    break;
                }
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                ok = 1;
                break;
            }
        }

        if (ok == 1) {
            System.out.println("invalid input");
        } else {
            for (taiKhoan tk : arr) {
                System.out.println(tk);
            }
        }
        sc.close();
    }
}
