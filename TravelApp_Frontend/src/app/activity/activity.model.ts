export interface Activity {
    name: string;
    description: string;
    location: {latitude: number, longitude: number};
    price: number;
}