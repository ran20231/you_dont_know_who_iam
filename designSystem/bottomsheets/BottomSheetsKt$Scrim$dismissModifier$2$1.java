package com.forsale.designSystem.bottomsheets;

import g00.a;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import q1.q;
import q1.s;
import wz.p;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$Scrim$dismissModifier$2$1 extends Lambda implements l<s, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f40856a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<p> f40857b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheets.kt */
    /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$Scrim$dismissModifier$2$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<p> f40858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a<p> aVar) {
            super(0);
            this.f40858a = aVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // g00.a
        public final Boolean invoke() {
            this.f40858a.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$Scrim$dismissModifier$2$1(String str, a<p> aVar) {
        super(1);
        this.f40856a = str;
        this.f40857b = aVar;
    }

    public final void b(s semantics) {
        o.i(semantics, "$this$semantics");
        q.O(semantics, this.f40856a);
        q.w(semantics, null, new AnonymousClass1(this.f40857b), 1, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(s sVar) {
        b(sVar);
        return p.f75480a;
    }
}
