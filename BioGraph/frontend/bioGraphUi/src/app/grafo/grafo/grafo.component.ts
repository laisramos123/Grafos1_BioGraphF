import { Component, OnInit } from '@angular/core';
import { Grafo } from '../model/grafo';
import { Animal } from './animal';

@Component({
  selector: 'app-grafo',
  templateUrl: './grafo.component.html',
  styleUrls: ['./grafo.component.css']
})
export class GrafoComponent implements OnInit {

  animal: any
  animais: any

  constructor() {
    this.animais=[
    {
      "id":1,
      "nome":"grama"
    },
    {
      "id":2,
      "nome":"Gazela"
    },
    {
      "id":3,
      "nome":"Zebra"
    },
    {
      "id":4,
      "nome":"Leão"
    },
    {
      "id":5,
      "nome":"Cheta"
    }      
    ]
  //  this.grafos = service.getAnimais();
  }

  ngOnInit(): void {
  }
}
