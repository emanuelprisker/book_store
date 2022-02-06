import React from "react";
import { Navbar, Container, NavDropdown, Nav } from "react-bootstrap";

class NavigationBar extends React.PureComponent {
  render() {
    return (
      <Navbar bg="light" expand="lg">
        <Navbar.Brand href="/">
          <img src="S:\Code\Java\kodigonlinestore\kodigonlinestore\src\main\resources\static\webapp\reactjs\media\kindpng_793803.png" />
        </Navbar.Brand>
        <Nav className="mr-auto">
          <Nav.Link href="#home">Home</Nav.Link>
          <Nav.Link href="#features">Features</Nav.Link>
          <Nav.Link href="#pricing">Pricing</Nav.Link>
        </Nav>
      </Navbar>
    );
  }
}

export default NavigationBar;
