public class Net {

    public static int parsePort(String s) {

        class PortRules {
            boolean ok(int p) {
                return p >= 1 && p <= 65535;
            }

            String explain(int p) {
                return "Port mora biti 1..65535, dobiveno: " + p;
            }
        }

        int p;
        try {
            p = Integer.parseInt(s.trim());
        } catch (Exception e) {
            throw new IllegalArgumentException("Port nije broj: " + s);
        }

        PortRules r = new PortRules();

        if (!r.ok(p)) {
            throw new IllegalArgumentException(r.explain(p));
        }

        return p;
    }

    public static void main(String[] args) {
        try {
            int port = parsePort("8080");
            System.out.println("Port je: " + port);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}