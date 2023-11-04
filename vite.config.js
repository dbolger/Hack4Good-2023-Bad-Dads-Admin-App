import path from "node:path";
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

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
        // host: '
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://localhost:5050',
                changeOrigin: true,
                rewrite: (path) => path.replace(/^\/api/, '')
            }
        }
    },
    publicDir: 'frontend/public',
})
