import Container from "../components/Container";
import Footer from "../components/Footer";

const About = () => {
  return (
    <Container>
      <div className="about">
        <div
          style={{
            display: "flex",
            alignItems: "center",
            justifyContent: "center",
            marginBottom: 48,
          }}
        >
          <img src="logo.jpeg" height={420} />
        </div>
        <h2>Descripcion</h2>
        <br /> <br />
        <p>
          Este proyecto de software esta basado en los requerimientos necesarios
          para gestionar el área de parqueos de un lugar destinado para el mismo
          en una empresa que se dedique a ofrecer el servicio de aparcamiento
          por concepto de renta o para cualquier empresa que necesite gestionar
          el uso de los espacios de parqueo en sus establecimiento ya sea que
          decida cobrar por el servicio u ofrecérselo a sus clientes para hacer
          mejor uso de sus parqueos de forma sistemática, organizada y
          eficiente.{" "}
        </p>
      </div>
    </Container>
  );
};

export default About;
