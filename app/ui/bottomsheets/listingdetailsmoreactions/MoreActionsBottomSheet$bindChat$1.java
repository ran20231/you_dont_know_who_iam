package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kr.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MoreActionsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindChat$1", f = "MoreActionsBottomSheet.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MoreActionsBottomSheet$bindChat$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38398a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38399b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MoreActionsBottomSheet f38400c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindChat$1$1", f = "MoreActionsBottomSheet.kt", l = {180}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$bindChat$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38401a;

        /* renamed from: b  reason: collision with root package name */
        Object f38402b;

        /* renamed from: c  reason: collision with root package name */
        Object f38403c;

        /* renamed from: d  reason: collision with root package name */
        int f38404d;

        /* renamed from: e  reason: collision with root package name */
        int f38405e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MoreActionsBottomSheet f38406f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MoreActionsBottomSheet moreActionsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38406f = moreActionsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f38406f, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            lr.a f02;
            m[] mVarArr;
            m[] mVarArr2;
            int i11;
            lr.a aVar;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i12 = this.f38405e;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f38404d;
                    mVarArr = (m[]) this.f38403c;
                    aVar = (lr.a) this.f38402b;
                    mVarArr2 = (m[]) this.f38401a;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                f02 = this.f38406f.f0();
                mVarArr = new m[1];
                MoreActionsBottomSheet moreActionsBottomSheet = this.f38406f;
                UserContactType userContactType = UserContactType.CHAT;
                this.f38401a = mVarArr;
                this.f38402b = f02;
                this.f38403c = mVarArr;
                this.f38404d = 0;
                this.f38405e = 1;
                Object Y = MoreActionsBottomSheet.Y(moreActionsBottomSheet, userContactType, null, false, this, 6, null);
                if (Y == f11) {
                    return f11;
                }
                mVarArr2 = mVarArr;
                i11 = 0;
                aVar = f02;
                obj = Y;
            }
            mVarArr[i11] = new ChatUserItem((ActionUserItemViewModel) obj, this.f38406f);
            aVar.n(mVarArr2);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreActionsBottomSheet$bindChat$1(MoreActionsBottomSheet moreActionsBottomSheet, zz.a<? super MoreActionsBottomSheet$bindChat$1> aVar) {
        super(2, aVar);
        this.f38400c = moreActionsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MoreActionsBottomSheet$bindChat$1 moreActionsBottomSheet$bindChat$1 = new MoreActionsBottomSheet$bindChat$1(this.f38400c, aVar);
        moreActionsBottomSheet$bindChat$1.f38399b = obj;
        return moreActionsBottomSheet$bindChat$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38398a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38400c, null);
            this.f38398a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f38399b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MoreActionsBottomSheet$bindChat$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
