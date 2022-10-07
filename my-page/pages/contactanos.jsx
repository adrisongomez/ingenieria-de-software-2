import Container from '../components/Container'
import Footer from '../components/Footer';

const Contactanos= () => { 
    return (
        <Container>
             <div className="contactanos">
                <h2>Ubicacion</h2>
                <br /> <br />
                <p>Estamos ubicados en la Av. Alma Mater, Santo Domingo 10105</p>
                <br /> <br />

                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3784.5208689367228!2d-69.92169018468323!3d18.46005117583934!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8ebaf4a942959859%3A0x5b383b1330fb7fcf!2sUASD%20Universidad%20Aut%C3%B3noma%20de%20Santo%20Domingo!5e0!3m2!1ses!2sdo!4v1621207030213!5m2!1ses!2sdo" width={1000} height={600} style={{border: 0}} allowFullScreen loading="lazy" />
             </div>
          
             <Footer />
        </Container>
        
    )
}


export default Contactanos