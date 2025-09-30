public class LirikLagu {

    public static void main(String[] args) {
        // Daftar lirik yang akan ditampilkan
        String[] lirik = {
            "Sudah terbiasa terjadi tante...",
            "Teman datang ketika lagi butuh saja...",
            "Coba kalo lagi susah...",
            "Mereka semua MENGHILANG..."
        };

        // Durasi jeda antar karakter dalam milidetik (misalnya, 80 ms)
        int jedaKarakter = 80; 
        
        // Jeda tambahan antar baris dalam milidetik (misalnya, 1500 ms = 1.5 detik)
        int jedaBaris = 1300; 

        System.out.println("Menampilkan lirik per karakter (typing effect):");
        System.out.println("-------------------------------------------------");

        try {
            // Loop utama untuk memproses setiap baris lirik
            for (String baris : lirik) {
                
                // Konversi String ke array karakter untuk diproses satu per satu
                char[] karakterBaris = baris.toCharArray();
                
                // Loop di dalam untuk memproses setiap karakter
                for (char karakter : karakterBaris) {
                    // Mencetak karakter tanpa baris baru (print, bukan println)
                    System.out.print(karakter);
                    
                    // Menahan eksekusi
                    Thread.sleep(jedaKarakter); 
                }
                
                // Setelah selesai satu baris, pindah ke baris baru
                System.out.println(); 
                
                // Tambahkan jeda yang lebih lama sebelum baris berikutnya
                Thread.sleep(jedaBaris);
            }
        } catch (InterruptedException e) {
            // Menangani jika proses tidur (sleep) diganggu
            Thread.currentThread().interrupt();
            System.err.println("Proses menampilkan lirik terganggu.");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Lirik selesai ditampilkan.");
    }
}