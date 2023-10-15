import java.util.Optional;

public interface ExternalSnippet {

    // @start region="example"
    /**
     * external
     */
    static void show(Optional<String> v) {
        if (v.isPresent()) {
            System.out.println("v: " + v.get());
        }
    }
    // @end
}
