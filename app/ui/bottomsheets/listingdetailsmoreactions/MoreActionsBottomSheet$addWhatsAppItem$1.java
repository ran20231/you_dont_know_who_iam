package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kr.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MoreActionsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$addWhatsAppItem$1", f = "MoreActionsBottomSheet.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MoreActionsBottomSheet$addWhatsAppItem$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38371a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38372b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MoreActionsBottomSheet f38373c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ UserContactType f38374d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f38375e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$addWhatsAppItem$1$1", f = "MoreActionsBottomSheet.kt", l = {160}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$addWhatsAppItem$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38376a;

        /* renamed from: b  reason: collision with root package name */
        Object f38377b;

        /* renamed from: c  reason: collision with root package name */
        Object f38378c;

        /* renamed from: d  reason: collision with root package name */
        int f38379d;

        /* renamed from: e  reason: collision with root package name */
        int f38380e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MoreActionsBottomSheet f38381f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UserContactType f38382g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f38383h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MoreActionsBottomSheet moreActionsBottomSheet, UserContactType userContactType, String str, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38381f = moreActionsBottomSheet;
            this.f38382g = userContactType;
            this.f38383h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f38381f, this.f38382g, this.f38383h, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            lr.a f02;
            m[] mVarArr;
            Object X;
            m[] mVarArr2;
            int i11;
            lr.a aVar;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i12 = this.f38380e;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f38379d;
                    mVarArr = (m[]) this.f38378c;
                    aVar = (lr.a) this.f38377b;
                    mVarArr2 = (m[]) this.f38376a;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                f02 = this.f38381f.f0();
                mVarArr = new m[1];
                MoreActionsBottomSheet moreActionsBottomSheet = this.f38381f;
                UserContactType userContactType = this.f38382g;
                String str = this.f38383h;
                this.f38376a = mVarArr;
                this.f38377b = f02;
                this.f38378c = mVarArr;
                this.f38379d = 0;
                this.f38380e = 1;
                X = moreActionsBottomSheet.X(userContactType, str, false, this);
                if (X == f11) {
                    return f11;
                }
                mVarArr2 = mVarArr;
                i11 = 0;
                aVar = f02;
                obj = X;
            }
            s viewLifecycleOwner = this.f38381f.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            FragmentManager childFragmentManager = this.f38381f.getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            mVarArr[i11] = new WhatsAppUserItem((ActionUserItemViewModel) obj, viewLifecycleOwner, childFragmentManager, this.f38381f.g0().i());
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
    public MoreActionsBottomSheet$addWhatsAppItem$1(MoreActionsBottomSheet moreActionsBottomSheet, UserContactType userContactType, String str, zz.a<? super MoreActionsBottomSheet$addWhatsAppItem$1> aVar) {
        super(2, aVar);
        this.f38373c = moreActionsBottomSheet;
        this.f38374d = userContactType;
        this.f38375e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MoreActionsBottomSheet$addWhatsAppItem$1 moreActionsBottomSheet$addWhatsAppItem$1 = new MoreActionsBottomSheet$addWhatsAppItem$1(this.f38373c, this.f38374d, this.f38375e, aVar);
        moreActionsBottomSheet$addWhatsAppItem$1.f38372b = obj;
        return moreActionsBottomSheet$addWhatsAppItem$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38371a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38373c, this.f38374d, this.f38375e, null);
            this.f38371a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f38372b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MoreActionsBottomSheet$addWhatsAppItem$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
