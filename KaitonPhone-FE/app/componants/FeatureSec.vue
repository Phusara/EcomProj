<script setup lang="ts">
interface FeatureSectionProps {
  title: string;
  subtitle: string;
  description: string;
  image: string;
  imageAlt: string;
  reverse?: boolean;
}

const props = withDefaults(defineProps<FeatureSectionProps>(), {
  reverse: false,
});
onMounted(() => {
console.log(props.image);
})
</script>

<template>
  <section class="py-32 relative overflow-hidden">
    <div class="container mx-auto px-6">
      <div
        :class="[
          'grid md:grid-cols-2 gap-16 items-center',
          reverse ? 'md:grid-flow-dense' : ''
        ]"
      >
        <!-- Text Content -->
        <div
          :class="[
            'space-y-6',
            reverse ? 'md:col-start-2' : ''
          ]"
        >
          <div class="space-y-2">
            <p class="text-primary text-sm font-semibold tracking-wider uppercase">
              {{ subtitle }}
            </p>
            <h2 class="text-5xl md:text-6xl font-bold tracking-tight">
              {{ title }}
            </h2>
          </div>
          <p class="text-xl text-muted-foreground leading-relaxed max-w-xl">
            {{ description }}
          </p>
        </div>

        <!-- Image -->
        <div
          :class="[
            'relative',
            reverse ? 'md:col-start-1 md:row-start-1' : ''
          ]"
        >
          <div class="relative rounded-3xl overflow-hidden shadow-[0_20px_60px_rgba(0,0,0,0.5)]">
            <img
              :src="image"
              :alt="imageAlt"
              class="w-full h-auto transform hover:scale-105 transition-transform duration-700"
            />
          </div>
          <!-- Decorative blur effect -->
          <div class="absolute -inset-4 bg-primary/20 rounded-3xl blur-3xl -z-10"></div>
        </div>
      </div>
    </div>
  </section>
</template>

<style scoped>
</style>
