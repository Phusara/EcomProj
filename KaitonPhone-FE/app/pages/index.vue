<script setup>
import FeatureSec from '~/componants/FeatureSec.vue';
import Navbar from '~/componants/Navbar.vue';
import Footer from '~/componants/Footer.vue';
import Hero from '~/componants/Hero.vue';

import featureCamera from '~/assets/feature-camera.jpg';
import featureDisplay from '~/assets/feature-display.jpg';
import featurePerformance from '~/assets/feature-performance.jpg';

</script>
<template>
 <div class="min-h-screen">
      <Navbar />
      <Hero />
      
      <div id="features" class="relative">
        <FeatureSec
          subtitle="Pro Camera System"
          title="Capture the extraordinary"
          description="The most advanced camera system ever in a smartphone. Take your photography to the next level with our revolutionary triple-lens setup and AI-powered processing."
          :image="featureCamera"
          imageAlt="Pro X Camera System"
        />

        <FeatureSec
          subtitle="Stunning Display"
          title="A screen like no other"
          description="Experience true-to-life colors on our edge-to-edge Super Retina XDR display. With ProMotion technology, everything you do feels incredibly smooth and responsive."
          :image="featureDisplay"
          imageAlt="Pro X Display"
          reverse
        />

        <FeatureSec
          subtitle="Blazing Performance"
          title="Power meets efficiency"
          description="Our most powerful chip yet delivers unprecedented performance while maintaining all-day battery life. Experience desktop-class gaming and effortless multitasking."
          :image="featurePerformance"
          imageAlt="Pro X Performance"
        />
      </div>

      <Footer />
    </div>
</template>
<style scoped>
@import '~/assets/tailwind.css';
</style>