export const config = {
    api_url: import.meta.env.VITE_API_URL ?? 'http://localhost:8080',
    api_token: import.meta.env.VITE_API_TOKEN ?? null,
}
export default config
