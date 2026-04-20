public static class Downloader {
    private Listener listener = null;

    public void setListener(Listener l) {
        this.listener = l;
    }

    public void download(String url) {
        if (listener != null) listener.onStart(url);

        for (int p = 0; p <= 100; p += 50) {
            if (listener != null) listener.onProgress(p);
        }

        if (listener != null) listener.onDone();
    }

    public static class Listener {
        public void onStart(String url) {}
        public void onProgress(int percent) {}
        public void onDone() {}
    }
}

public static void main(String[] args){
    Downloader d = new Downloader();

    d.setListener(new Downloader.Listener() {
        @Override
        public void onStart(String url) {
            System.out.println("Start: " + url);
        }

        @Override
        public void onProgress(int p) {
            System.out.println("Progress: " + p + "%");
        }

        @Override
        public void onDone() {
            System.out.println("Done");
        }
    });

    d.download("https://example.com/file");
}