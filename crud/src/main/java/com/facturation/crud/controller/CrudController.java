package com.facturation.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturation.crud.Model.Cliente;
import com.facturation.crud.Model.Detalle;
import com.facturation.crud.Model.Factura;
import com.facturation.crud.Model.Producto;
import com.facturation.crud.service.ClienteService;
import com.facturation.crud.service.DetalleService;
import com.facturation.crud.service.FacturaService;
import com.facturation.crud.service.ProductoService;


@RestController
@RequestMapping("/crud")
@CrossOrigin

public class CrudController {
	

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private FacturaService facturaService;
    @Autowired
    private ProductoService productoService;
    @Autowired
    private DetalleService detalleService;

    @PostMapping("/clientes/add")
    public String addClientes(@RequestBody Cliente cliente){
    	clienteService.saveCliente(cliente);
        return "New Client is added";
    }
    
    @GetMapping("/clientes/getAll")
    public List<Cliente> listClientes(){
        return clienteService.getAllClientes();
    }

    @PostMapping("/facturas/add")
    public String addFacturas(@RequestBody Factura factura){
    	facturaService.saveFactura(factura);
        return "New Facture is added";
    }
    
    @GetMapping("/facturas/getAll")
    public List<Factura> listFacturas(){
        return facturaService.getAllFactura();
    }
    
    @GetMapping("/facturas/getById/{id_cliente}")
    public Factura findFactura(@PathVariable("id_cliente") int id_cliente){
    	
    	for (Factura lisFactura : listFacturas()) {
    		
    		if(lisFactura.getId_cliente().getId_cliente()==id_cliente) {
    			
    			return lisFactura;
    		}
			
		}
        return null;
    }
    

    @PostMapping("/productos/add")
    public String addProductos(@RequestBody Producto producto){
    	productoService.saveProducto(producto);
        return "New Producto is added";
    }

    @GetMapping("/productos/getAll")
    public List<Producto> listProducto(){
        return productoService.getAllProductos();
    }

    @PostMapping("/detalles/add")
    public String addDetalle(@RequestBody Detalle detalle){
    	detalleService.saveDetalle(detalle);
        return "New Detaiil is added";
    }

    @GetMapping("/detalles/getAll")
    public List<Detalle> listDetalles(){
        return detalleService.getAllDetalles();
    }

    @GetMapping("/detalles/getById/{num_factura}")
    public Detalle findDetalle(@PathVariable("num_factura") int num_factura ){
    	
    	for (Detalle lisDetalle : listDetalles()) {
    		
    		if(lisDetalle.getNum_factura().getNum_factura()== num_factura ) {
    			
    			return lisDetalle;
    		}
			
		}
        return null;
    }
    
//    @DeleteMapping("/deleteById/{id}")
//    public String delete(@PathVariable("id") Integer id){
//    	studentService.deleteStudent(id);
//    	return "Delete Success";
//    }
//    
//
//    @PutMapping("/update")
//    public String update(@RequestBody Student student){
//        studentService.updateStudent(student);
//        return "Update student is Success";
//    }


}
