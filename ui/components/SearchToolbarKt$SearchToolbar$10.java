package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.inputs.InputsKt;
import g00.l;
import g00.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchToolbar.kt */
/* loaded from: classes3.dex */
public final class SearchToolbarKt$SearchToolbar$10 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42331a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f42332b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42333c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Integer f42334d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42335e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchToolbar.kt */
    /* renamed from: com.forsale.ui.components.SearchToolbarKt$SearchToolbar$10$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements p<a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, int i11) {
            super(2);
            this.f42336a = str;
            this.f42337b = i11;
        }

        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1830252317, i11, -1, "com.forsale.ui.components.SearchToolbar.<anonymous>.<anonymous> (SearchToolbar.kt:184)");
            }
            TextKt.a(this.f42336a, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42337b >> 12) & 14, 0, 2046);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchToolbar.kt */
    /* renamed from: com.forsale.ui.components.SearchToolbarKt$SearchToolbar$10$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements l<String, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        public static final AnonymousClass2 f42338a = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        public final void b(String it2) {
            o.i(it2, "it");
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ wz.p invoke(String str) {
            b(str);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchToolbarKt$SearchToolbar$10(String str, c cVar, String str2, Integer num, int i11) {
        super(2);
        this.f42331a = str;
        this.f42332b = cVar;
        this.f42333c = str2;
        this.f42334d = num;
        this.f42335e = i11;
    }

    public final void b(a aVar, int i11) {
        r0.a b11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(443733792, i11, -1, "com.forsale.ui.components.SearchToolbar.<anonymous> (SearchToolbar.kt:181)");
        }
        String str = this.f42331a;
        if (str == null) {
            b11 = null;
        } else {
            b11 = b.b(aVar, 1830252317, true, new AnonymousClass1(str, this.f42335e));
        }
        c cVar = this.f42332b;
        String str2 = this.f42333c;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.f42338a;
        Integer num = this.f42334d;
        int i12 = this.f42335e;
        InputsKt.i(cVar, str2, anonymousClass2, null, false, 0, 0, b11, null, null, null, null, null, null, num, aVar, (i12 & 112) | 24960, (i12 >> 3) & 57344, 16232);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
