# Harnon Titanium 🔊

> **v6.0.0-titanium** — A premium offline Android music player with a Liquid Glass aesthetic.

![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android)
![Kotlin](https://img.shields.io/badge/Kotlin-2.1+-7F52FF?logo=kotlin)
![Compose](https://img.shields.io/badge/Jetpack%20Compose-2024.12-4285F4?logo=jetpackcompose)
![API](https://img.shields.io/badge/Min%20API-29-FF6D00?logo=android)

---

## ✨ Features

- **Offline Music Playback** — Full local library scanner for songs, albums, artists, and folders
- **Liquid Glass UI** — Premium glassmorphism interface with animated frosted-glass chips, micro-interactions, and dynamic blur layers
- **Immersive Now Playing** — Dynamic color extraction from album art using Palette API
- **Built-in Equalizer** — 10-band EQ with presets and custom tuning
- **Zen Mode** — Distraction-free listening with minimalist ambient UI
- **Vault** — Secure hidden storage for private tracks
- **Dot Matrix Visualizer** — Real-time audio visualization
- **Favorites & Playlists** — Mark favorites, create and manage playlists
- **Shuffle & Repeat** — Multiple repeat modes with smart shuffle
- **Mini Player** — Persistent mini player with swipe-up gesture
- **Search** — Fast full-library search across songs, albums, and artists

## 🧠 Tech Stack

| Layer | Technology |
|-------|-----------|
| **Language** | Kotlin 2.1+ |
| **UI Framework** | Jetpack Compose + Material3 |
| **Navigation** | Navigation Compose |
| **Media Playback** | AndroidX Media3 / ExoPlayer |
| **Database** | Room (SQLite) |
| **DI** | Dagger Hilt |
| **Image Loading** | Coil |
| **Color Analysis** | Palette API |
| **Architecture** | MVI-style with ViewModel + StateFlow |

## 🚀 Getting Started

### Prerequisites

- Android Studio Meerkat (2024.3.1+) or later
- JDK 17+
- Android SDK 35+

### Build & Install

```bash
git clone https://github.com/Vansh756/harnon-titanium.git
# Open in Android Studio and sync Gradle, or build via CLI:
./gradlew assembleDebug  # Debug build
./gradlew assembleRelease  # Release build (with keystore configured)
```

## 📦 Download

Download the latest APK from the [Releases](https://github.com/Vansh756/harnon-titanium/releases) page.

## 📄 License

MIT License - Copyright (c) 2026 Vansh756