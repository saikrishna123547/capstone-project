import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Purchase } from './purchase';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PurchaseService {
  private url:string;
  constructor(private http:HttpClient) { 
    this.url="http://localhost:8089/Purchase";
  }

  public addPurchase(purchase:Purchase):Observable<Purchase>{
    return this.http.post<Purchase>(this.url , purchase);
  }

  
  public deletePurchase(id):Observable<Purchase>{
    return this.http.delete<Purchase>("http://localhost:8089/Purchase/" + id);
  }
  public updatePurchase(purchase:Purchase):Observable<Purchase>{
    return this.http.put<Purchase>(this.url,purchase);
  }
  public getAllItems():Observable<Purchase[]>{
    return this.http.get<Purchase[]>(this.url+"s");
  }
 
}
