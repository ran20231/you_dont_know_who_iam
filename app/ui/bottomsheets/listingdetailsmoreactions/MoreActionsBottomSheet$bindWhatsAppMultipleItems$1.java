package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MoreActionsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindWhatsAppMultipleItems$1", f = "MoreActionsBottomSheet.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MoreActionsBottomSheet$bindWhatsAppMultipleItems$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38407a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38408b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<String> f38409c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MoreActionsBottomSheet f38410d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindWhatsAppMultipleItems$1$1", f = "MoreActionsBottomSheet.kt", l = {142}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindWhatsAppMultipleItems$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38411a;

        /* renamed from: b  reason: collision with root package name */
        Object f38412b;

        /* renamed from: c  reason: collision with root package name */
        Object f38413c;

        /* renamed from: d  reason: collision with root package name */
        Object f38414d;

        /* renamed from: e  reason: collision with root package name */
        Object f38415e;

        /* renamed from: f  reason: collision with root package name */
        int f38416f;

        /* renamed from: g  reason: collision with root package name */
        int f38417g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<String> f38418h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ MoreActionsBottomSheet f38419i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list, MoreActionsBottomSheet moreActionsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38418h = list;
            this.f38419i = moreActionsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f38418h, this.f38419i, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0076 -> B:15:0x007c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f38417g
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                int r2 = r0.f38416f
                java.lang.Object r4 = r0.f38415e
                lr.a r4 = (lr.a) r4
                java.lang.Object r5 = r0.f38414d
                kr.m[] r5 = (kr.m[]) r5
                java.lang.Object r6 = r0.f38413c
                kr.m[] r6 = (kr.m[]) r6
                java.lang.Object r7 = r0.f38412b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f38411a
                com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet r8 = (com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet) r8
                kotlin.f.b(r17)
                r9 = r6
                r10 = r7
                r6 = r8
                r8 = r17
                r7 = r5
                r5 = r4
                r4 = r0
                goto L7c
            L2f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L37:
                kotlin.f.b(r17)
                java.util.List<java.lang.String> r2 = r0.f38418h
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet r4 = r0.f38419i
                java.util.Iterator r2 = r2.iterator()
                r7 = r2
                r2 = r0
            L46:
                boolean r5 = r7.hasNext()
                if (r5 == 0) goto L95
                java.lang.Object r5 = r7.next()
                r10 = r5
                java.lang.String r10 = (java.lang.String) r10
                lr.a r5 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet.J(r4)
                kr.m[] r6 = new kr.m[r3]
                com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactType r9 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactType.WHATS_APP
                r11 = 0
                r13 = 4
                r14 = 0
                r2.f38411a = r4
                r2.f38412b = r7
                r2.f38413c = r6
                r2.f38414d = r6
                r2.f38415e = r5
                r15 = 0
                r2.f38416f = r15
                r2.f38417g = r3
                r8 = r4
                r12 = r2
                java.lang.Object r8 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet.Y(r8, r9, r10, r11, r12, r13, r14)
                if (r8 != r1) goto L76
                return r1
            L76:
                r9 = r6
                r10 = r7
                r6 = r4
                r7 = r9
                r4 = r2
                r2 = r15
            L7c:
                com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel r8 = (com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel) r8
                androidx.lifecycle.s r11 = r6.getViewLifecycleOwner()
                java.lang.String r12 = "getViewLifecycleOwner(...)"
                kotlin.jvm.internal.o.h(r11, r12)
                com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.WhatsAppMultipleUserItem r12 = new com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.WhatsAppMultipleUserItem
                r12.<init>(r8, r11)
                r7[r2] = r12
                r5.n(r9)
                r2 = r4
                r4 = r6
                r7 = r10
                goto L46
            L95:
                wz.p r1 = wz.p.f75480a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindWhatsAppMultipleItems$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreActionsBottomSheet$bindWhatsAppMultipleItems$1(List<String> list, MoreActionsBottomSheet moreActionsBottomSheet, zz.a<? super MoreActionsBottomSheet$bindWhatsAppMultipleItems$1> aVar) {
        super(2, aVar);
        this.f38409c = list;
        this.f38410d = moreActionsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MoreActionsBottomSheet$bindWhatsAppMultipleItems$1 moreActionsBottomSheet$bindWhatsAppMultipleItems$1 = new MoreActionsBottomSheet$bindWhatsAppMultipleItems$1(this.f38409c, this.f38410d, aVar);
        moreActionsBottomSheet$bindWhatsAppMultipleItems$1.f38408b = obj;
        return moreActionsBottomSheet$bindWhatsAppMultipleItems$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38407a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38409c, this.f38410d, null);
            this.f38407a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f38408b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MoreActionsBottomSheet$bindWhatsAppMultipleItems$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
