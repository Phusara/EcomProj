<script setup>
import { ref, onMounted, onUnmounted } from 'vue'

const isScrolled = ref(false)

const handleScroll = () => {
  isScrolled.value = window.scrollY > 50
}

onMounted(() => {
  window.addEventListener('scroll', handleScroll)
})

onUnmounted(() => {
  window.removeEventListener('scroll', handleScroll)
})
</script>

<template>
 <nav
    :class="[
      'fixed top-0 left-0 right-0 z-50 transition-all duration-300',
      isScrolled ? 'glass py-3' : 'bg-transparent py-6'
    ]"
  >
    <div class="container mx-auto px-6 flex items-center justify-between">
      <div class="text-2xl font-bold text-gradient">Pro X</div>
        
      <div class="hidden md:flex items-center gap-8">
        <a href="#features" class="text-muted-foreground hover:text-foreground transition-colors">
            Features
          </a>
        <a href="#specs" class="text-muted-foreground hover:text-foreground transition-colors">
            Specs
          </a>
        <a href="#gallery" class="text-muted-foreground hover:text-foreground transition-colors">
            Gallery
          </a>
        </div>

        <button variant="hero" size="lg">
          Buy Now
        </button>
      </div>
    </nav>
</template>
<style scoped>
</style>