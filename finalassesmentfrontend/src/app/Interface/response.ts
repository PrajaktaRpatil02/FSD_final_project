export interface Response {
}

export interface HotelResponse {
    message: string
    data: Data[]
  }
  
  export interface Data {
    id: number
    name: string
    roomPrice: number
    imageUrl: string
    description: string
    rating: number
    city: string
    email: string
    wifi: boolean
    gym: boolean
    pool: boolean
    createAt: string
    updatedAt: string
  }
  