import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
    private url:string;
    constructor(private http:HttpClient) { 
      this.url="http://localhost:8089/Product";
    }
  
    public addProduct(product:Product):Observable<Product>{
      return this.http.post<Product>(this.url , product);
    }
    public deleteProduct(id):Observable<Product>{
      return this.http.delete<Product>("http://localhost:8089/Product/" + id);
    }

     public updateProduct(product:Product):Observable<Product>{
      return this.http.put<Product>(this.url , product);
     }

     public getAllProducts():Observable<Product[]>{
      return this.http.get<Product[]>(this.url+ "s");
     }
  
  }
