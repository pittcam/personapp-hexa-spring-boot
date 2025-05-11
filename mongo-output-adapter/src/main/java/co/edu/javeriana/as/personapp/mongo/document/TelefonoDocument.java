package co.edu.javeriana.as.personapp.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("telefono")
public class TelefonoDocument {
	@Id
	private String id;
	private String oper;
	@Field("duenio")
	@DocumentReference(lazy = true)
    private PersonaDocument primaryDuenio;
}
