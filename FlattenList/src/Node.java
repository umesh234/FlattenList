import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@AllArgsConstructor
@EqualsAndHashCode
public class Node {

	@Getter @Setter int value;
	@Getter @Setter Node prev;
	@Getter @Setter Node next;
	@Getter @Setter Node child;
}
