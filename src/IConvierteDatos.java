import com.fasterxml.jackson.databind.JsonMappingException;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class<T> clase) throws JsonMappingException;
}
