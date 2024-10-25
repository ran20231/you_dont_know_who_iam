package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuarantineCardViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardViewModel$updateMessage$1", f = "QuarantineCardViewModel.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class QuarantineCardViewModel$updateMessage$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27939a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ QuarantineCardViewModel f27940b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuarantineCardViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardViewModel$updateMessage$1$1", f = "QuarantineCardViewModel.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardViewModel$updateMessage$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27941a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f27942b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QuarantineCardViewModel f27943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(QuarantineCardViewModel quarantineCardViewModel, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27943c = quarantineCardViewModel;
        }

        public final Object b(boolean z11, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27943c, aVar);
            anonymousClass1.f27942b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, a<? super wz.p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableStateFlow mutableStateFlow;
            ApplicationResourcesRepository applicationResourcesRepository;
            int i11;
            f11 = b.f();
            int i12 = this.f27941a;
            if (i12 != 0) {
                if (i12 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                boolean z11 = this.f27942b;
                mutableStateFlow = this.f27943c.f27933h;
                applicationResourcesRepository = this.f27943c.f27928c;
                if (z11) {
                    i11 = y0.S6;
                } else {
                    i11 = y0.R6;
                }
                String string = applicationResourcesRepository.getString(i11, new Object[0]);
                this.f27941a = 1;
                if (mutableStateFlow.emit(string, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarantineCardViewModel$updateMessage$1(QuarantineCardViewModel quarantineCardViewModel, a<? super QuarantineCardViewModel$updateMessage$1> aVar) {
        super(2, aVar);
        this.f27940b = quarantineCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new QuarantineCardViewModel$updateMessage$1(this.f27940b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27939a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            StateFlow<Boolean> g11 = this.f27940b.g();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27940b, null);
            this.f27939a = 1;
            if (FlowKt.collectLatest(g11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((QuarantineCardViewModel$updateMessage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
