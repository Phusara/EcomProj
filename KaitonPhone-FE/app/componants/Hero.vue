<script setup>
import heroPhone from '~/assets/hero-phone.jpg' // Assuming heroPhone is an imported image; adjust path as needed
</script>

<template>
  <section class="relative min-h-screen flex items-center justify-center overflow-hidden pt-20">
    <!-- Gradient background effects -->
    <div class="absolute inset-0 bg-gradient-to-b from-primary/20 via-background to-background"></div>
    <div class="absolute top-1/4 left-1/4 w-96 h-96 bg-primary/30 rounded-full blur-[120px] animate-glow"></div>
    <div class="absolute bottom-1/4 right-1/4 w-96 h-96 bg-accent/30 rounded-full blur-[120px] animate-glow"></div>

    <div class="container mx-auto px-6 relative z-10">
      <div class="text-center space-y-8 animate-fade-in-up">
        <div class="space-y-4">
          <p class="text-primary text-sm font-semibold tracking-wider uppercase">
            Introducing
          </p>
          <h1 class="text-6xl md:text-8xl font-bold tracking-tight">
            <span class="text-gradient">Kaiton Pro X</span>
          </h1>
          <p class="text-2xl md:text-4xl text-muted-foreground font-light max-w-3xl mx-auto">
            A masterpiece of innovation
          </p>
        </div>

        <div class="flex flex-col sm:flex-row gap-4 justify-center items-center">
          <button variant="hero" size="lg" class="text-base px-8 py-6 h-auto">
            Pre-order Now
          </button>
          <button variant="glass" size="lg" class="text-base px-8 py-6 h-auto">
            Learn More
          </button>
        </div>

        <!-- Hero Product Image -->
        <div class="mt-16 relative">
          <div class="absolute inset-0 bg-gradient-to-t from-background via-transparent to-transparent z-10"></div>
          <img
            :src="heroPhone"
            alt="Pro X Smartphone"
            class="w-full max-w-4xl mx-auto animate-float drop-shadow-[0_35px_35px_rgba(0,0,0,0.5)]"
          />
        </div>
      </div>
    </div>

    <!-- Scroll indicator -->
    <div class="absolute bottom-8 left-1/2 -translate-x-1/2 animate-bounce">
      <div class="w-6 h-10 border-2 border-muted-foreground rounded-full flex justify-center">
        <div class="w-1 h-2 bg-muted-foreground rounded-full mt-2 animate-pulse"></div>
      </div>
    </div>
  </section>
</template>

<style scoped>
</style>