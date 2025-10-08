<script setup>
const currentYear = new Date().getFullYear()
</script>
<template>
  <footer class="border-t border-border py-12">
    <div class="container mx-auto px-6">
      <div class="grid grid-cols-2 md:grid-cols-4 gap-8 mb-8">
        <div>
          <h3 class="font-semibold mb-4">Shop</h3>
          <ul class="space-y-2 text-sm text-muted-foreground">
            <li><a href="#" class="hover:text-foreground transition-colors">Pro X</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">Accessories</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">Special Offers</a></li>
          </ul>
        </div>

        <div>
          <h3 class="font-semibold mb-4">Support</h3>
          <ul class="space-y-2 text-sm text-muted-foreground">
            <li><a href="#" class="hover:text-foreground transition-colors">Contact Us</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">FAQ</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">Warranty</a></li>
          </ul>
        </div>

        <div>
          <h3 class="font-semibold mb-4">Company</h3>
          <ul class="space-y-2 text-sm text-muted-foreground">
            <li><a href="#" class="hover:text-foreground transition-colors">About</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">Careers</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">News</a></li>
          </ul>
        </div>

        <div>
          <h3 class="font-semibold mb-4">Legal</h3>
          <ul class="space-y-2 text-sm text-muted-foreground">
            <li><a href="#" class="hover:text-foreground transition-colors">Privacy</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">Terms</a></li>
            <li><a href="#" class="hover:text-foreground transition-colors">Cookies</a></li>
          </ul>
        </div>
      </div>

      <div class="pt-8 border-t border-border text-center text-sm text-muted-foreground">
        <p>© {{ currentYear }} Pro X. All rights reserved.</p>
      </div>
    </div>
  </footer>
</template>