package com.forsale.app.utils;

import androidx.lifecycle.LiveData;
/* compiled from: LiveDataExtensions.kt */
/* loaded from: classes3.dex */
public final class LiveDataExtensions {

    /* renamed from: a  reason: collision with root package name */
    public static final LiveDataExtensions f39587a = new LiveDataExtensions();

    /* compiled from: LiveDataExtensions.kt */
    /* loaded from: classes3.dex */
    static final class a implements androidx.lifecycle.c0, kotlin.jvm.internal.k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ g00.l f39588a;

        a(g00.l function) {
            kotlin.jvm.internal.o.i(function, "function");
            this.f39588a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f39588a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.c0) || !(obj instanceof kotlin.jvm.internal.k)) {
                return false;
            }
            return kotlin.jvm.internal.o.d(c(), ((kotlin.jvm.internal.k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39588a.invoke(obj);
        }
    }

    private LiveDataExtensions() {
    }

    public static final <T, K, R> LiveData<R> a(final LiveData<T> liveData, final LiveData<K> liveData2, final g00.p<? super T, ? super K, ? extends R> block) {
        kotlin.jvm.internal.o.i(liveData, "<this>");
        kotlin.jvm.internal.o.i(liveData2, "liveData");
        kotlin.jvm.internal.o.i(block, "block");
        final androidx.lifecycle.z zVar = new androidx.lifecycle.z();
        zVar.b(liveData, new a(new g00.l<T, wz.p>() { // from class: com.forsale.app.utils.LiveDataExtensions$combineWith$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(T t11) {
                zVar.setValue(block.invoke(liveData.getValue(), liveData2.getValue()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Object obj) {
                b(obj);
                return wz.p.f75480a;
            }
        }));
        zVar.b(liveData2, new a(new g00.l<K, wz.p>() { // from class: com.forsale.app.utils.LiveDataExtensions$combineWith$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(K k11) {
                zVar.setValue(block.invoke(liveData.getValue(), liveData2.getValue()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Object obj) {
                b(obj);
                return wz.p.f75480a;
            }
        }));
        return zVar;
    }
}
