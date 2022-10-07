import Container from "../components/Container";
import Footer from "../components/Footer";

const Descargas = () => {
  return (
    <Container>
      <div className="descargas" style={{ textAlign: "center" }}>
        <br />
        {/* <img src="parking download.png" alt="" width="700" height="447"/> */}

        <br />
        <h2>Descargas</h2>
        <br />

        <p>
          Haz Click en descargar para obtene nuestro sistema nuestro sistema.
        </p>
        <br />

        <a href="ProyectoParqueadero.jar" style={{ color: "black" }}>
          Descargar
        </a>
      </div>
    </Container>
  );
};

export default Descargas;
