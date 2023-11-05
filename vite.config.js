import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import { config } from 'dotenv'
const { parsed } = config()

// https://vitejs.dev/config/
export default defineConfig({
    build: {
        outDir: 'frontend/dist',
        emptyOutDir: true,
        manifest: true,
        rollupOptions: {
            input: 'index.html'
        }
    },
    root: 'frontend',
    plugins: [vue()],
    server:{
        host: 'localhost',
        port: 3000,
        proxy: {
            '/api': {
                target: parsed?.VITE_API_URL ?? 'http://localhost:8080',
                changeOrigin: true,
                secure: false,
                rewrite: (path) => path.replace(/^\/api/, ''),
                cors: false, // shhhh
            }
        },
        cors: false, // shhhh
    },
    publicDir: 'public',
})
