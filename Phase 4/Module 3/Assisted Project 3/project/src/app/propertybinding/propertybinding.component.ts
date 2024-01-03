import { Component } from '@angular/core';

@Component({
  selector: 'app-propertybinding',
  templateUrl: './propertybinding.component.html',
  styleUrl: './propertybinding.component.css',
})
export class PropertybindingComponent {
  pageTitle: string = 'Property Binding';
  imagePath: string =
    'https://source.unsplash.com/1920x700/?human,humans,people';
  imageTitle: string = 'Party-img';
}
