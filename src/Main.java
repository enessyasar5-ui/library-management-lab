
    public static void main(String[] args) {
        Library vulnerableLibrary = new Library();

        System.out.println("[+] Zafiyet Testi Basliyor...\n");

        // --- SALDIRI VEKTÖRÜ 1: Null Pointer Injection (Girdi Doğrulama Zafiyeti) ---
        System.out.println("[!] Vektor 1: Null Referans Enjeksiyonu");
        // Kütüphaneye fiziksel olarak var olmayan (bellekte adresi null olan) bir kitap ekleniyor.
        vulnerableLibrary.addbook(null);

        // --- SALDIRI VEKTÖRÜ 2: Bellek Yanılsaması (Memory Aliasing) ---
        System.out.println("[!] Vektor 2: Ayni Bellek Referansini Coklu Ekleme");
        Book targetBook = new Book("Buffer Overflow", "Attacker", 1337);
        vulnerableLibrary.addbook(targetBook);
        // Aynı kitap nesnesi (aynı bellek adresi) listeye kasten ikinci kez ekleniyor.
        vulnerableLibrary.addbook(targetBook);

        // --- SALDIRI VEKTÖRÜ 3: Dizin Senkronizasyonu Bozma (lbooks vs obooks) ---
        System.out.println("[!] Vektor 3: Olmayan Bir Kitabi Iade Etmeye Calisma");
        // Sisteme hiç eklenmemiş bir ISBN numarası gönderilerek döngü sınırları zorlanıyor.
        vulnerableLibrary.returnb(9999);

        // --- SISTEMI ÇÖKERTME TETİKLEYİCİSİ ---
        System.out.println("\n[!] Sistemin Cokmesi Tetikleniyor (Listeleme Cagrisi)...");
        // NullPointerException veya IndexOutOfBoundsException fırlatılacak.
        vulnerableLibrary.listL();
    }
