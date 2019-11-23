package lombok;



//@ToString               // dodaje metodę toString()
//@Setter                 // dodaje settery dla wszystkich pól
//@Getter                 // dodaje gettery dla wszystkich pól
//@NoArgsConstructor      //dodaje konstruktor bez argumentow
@AllArgsConstructor     // dodaje konstruktor ze wszystkimi polami klasowymi w argumencie
@Data                   //dodaje gettery i settery i toString() do wszystkich pól klasowych
public class Annotationslombok {
    private String login;
    private String password;
    private String acronim;

}
