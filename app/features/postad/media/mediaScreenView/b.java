package com.forsale.app.features.postad.media.mediaScreenView;

import kotlin.jvm.internal.o;
/* compiled from: ImagesView.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ImagesView.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36275a = new a();

        private a() {
        }
    }

    /* compiled from: ImagesView.kt */
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenView.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0417b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final bf.a f36276a;

        public C0417b(bf.a imageViewModel) {
            o.i(imageViewModel, "imageViewModel");
            this.f36276a = imageViewModel;
        }

        public final bf.a a() {
            return this.f36276a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0417b) && o.d(this.f36276a, ((C0417b) obj).f36276a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f36276a.hashCode();
        }

        public String toString() {
            bf.a aVar = this.f36276a;
            return "DeleteImage(imageViewModel=" + aVar + ")";
        }
    }

    /* compiled from: ImagesView.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final bf.a f36277a;

        public c(bf.a imageViewModel) {
            o.i(imageViewModel, "imageViewModel");
            this.f36277a = imageViewModel;
        }

        public final bf.a a() {
            return this.f36277a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && o.d(this.f36277a, ((c) obj).f36277a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f36277a.hashCode();
        }

        public String toString() {
            bf.a aVar = this.f36277a;
            return "EditImage(imageViewModel=" + aVar + ")";
        }
    }
}
