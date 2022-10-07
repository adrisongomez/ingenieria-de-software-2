import Link from 'next/link'

const Navegacion = () => {
    return (
        <header className="header2">

            <div className="wrapper" style={{
                display: "flex",
                alignItems: "center",
                justifyContent: 'space-between'
            }}>
                <img className="logo" src="logo.jpeg" alt="" />
                <nav>

                    <Link href="/">
                        <a className="navbar-brand">Inicio</a>
                    </Link>

                    <Link href="/services">
                        <a className="nav-link active" aria-current="page">Servicios</a>
                    </Link>


                    <Link href="/about">
                        <a className="nav-link active" aria-current="page">Sobre Nosotros</a>
                    </Link>

                    <Link href="/descargas">
                        <a className="nav-link active" aria-current="page">Descargas</a>
                    </Link>

                    <Link href="/contactanos">
                        <a className="nav-link active" aria-current="page">Conctactanos</a>
                    </Link>


                </nav>
            </div>
        </header>
    )
}

export default Navegacion;
