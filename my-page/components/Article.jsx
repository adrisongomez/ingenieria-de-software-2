const Article= () => { 
    return (
       <article className="mejoresOfertas">
           <p className="titulo-ofertas">Mejores Ofertas</p>

           <section className="ofertas">
                <section className="card">
                    <br />
                    <img src="MT.jpg" alt="Motocicletas"  />
                    <p className="nombrePaquete"> Parqueo de Motocicletas</p>
                    <p className="descripcion"> Ofrecemos el sevicio de parqueo de Motocicletas <br /> <br /><span> Desde: </span> <br /> <br /> <span className="precio">$50/hora </span></p>
                    <a href="#" className="botonver"> Ver Plan</a>

                </section>

                <section className="card">
                    <br /> <br /> <br />
                    <img src="VH.jpg" alt=""  />
                    <br /> <br /> <br />
                    <p className="nombrePaquete"> Parqueo de Vehiculos</p>
                    <p className="descripcion"> Ofrecemos el sevicio de parqueo de carro y behiculo similares <br /> <br /><span> Desde: </span> <br /><br /> <span className="precio">$100/hora </span> </p>
                    <a href="#" className="botonver"> Ver Plan</a>

                </section>

                    <section className="card">
                    <br /> <br /> <br />
                    <img src="VHP.jpg" alt="" />
                    <br /> <br /> <br /> <br />
                    <p className="nombrePaquete"> Parqueo de Vehiculos Pesados </p>
                    <p className="descripcion"> Parqueo de vehiculos pesados Ofrecemos el sevicio de parqueo de camiones y guaguas <br /><br /> <span> Desde: </span><br /><br /> <span className="precio">$150/hora </span></p>
                    <a href="#" className="botonver"> Ver Plan</a>

                    </section>

                    <br />
                    <br />
                    <br />
           </section>

       </article>
      
        
    )
}


export default Article;