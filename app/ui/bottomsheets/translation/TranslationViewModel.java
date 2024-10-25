package com.forsale.app.ui.bottomsheets.translation;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.databinding.i;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import t9.r0;
import wz.p;
/* compiled from: TranslationViewModel.kt */
/* loaded from: classes3.dex */
public final class TranslationViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final TranslationRepository f39136k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ObservableInt f39137l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ObservableBoolean f39138m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39139n0;

    /* renamed from: o0  reason: collision with root package name */
    private final i.a f39140o0;

    /* compiled from: TranslationViewModel.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.translation.TranslationViewModel$1", f = "TranslationViewModel.kt", l = {PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.translation.TranslationViewModel$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39141a;

        /* compiled from: TranslationViewModel.kt */
        /* renamed from: com.forsale.app.ui.bottomsheets.translation.TranslationViewModel$1$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f39143a;

            static {
                int[] iArr = new int[TranslationRepository.Translation.values().length];
                try {
                    iArr[TranslationRepository.Translation.ORIGINAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TranslationRepository.Translation.ARABIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TranslationRepository.Translation.ENGLISH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39143a = iArr;
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f39141a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                TranslationViewModel translationViewModel = TranslationViewModel.this;
                this.f39141a = 1;
                obj = translationViewModel.z0(this);
                if (obj == f11) {
                    return f11;
                }
            }
            int i12 = a.f39143a[((TranslationRepository.Translation) obj).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        TranslationViewModel.this.A0().k(r0.Q6);
                    }
                } else {
                    TranslationViewModel.this.A0().k(r0.P6);
                }
            } else {
                TranslationViewModel.this.A0().k(r0.T6);
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: ObservableExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class a extends i.a {
        public a() {
        }

        @Override // androidx.databinding.i.a
        public void d(i observable, int i11) {
            o.i(observable, "observable");
            ObservableInt observableInt = (ObservableInt) observable;
            TranslationViewModel translationViewModel = TranslationViewModel.this;
            BuildersKt__Builders_commonKt.launch$default(translationViewModel, null, null, new TranslationViewModel$currentLanguageViewIdCallback$1$1(translationViewModel, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationViewModel(TranslationRepository translationRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(translationRepository, "translationRepository");
        o.i(baseRepository, "baseRepository");
        this.f39136k0 = translationRepository;
        ObservableInt observableInt = new ObservableInt();
        this.f39137l0 = observableInt;
        this.f39138m0 = new ObservableBoolean(false);
        this.f39139n0 = new OneShotEventHandler<>(null, 0, 3, null);
        a aVar = new a();
        observableInt.a(aVar);
        this.f39140o0 = aVar;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TranslationRepository.Translation D0(int i11) {
        if (i11 == r0.T6) {
            return TranslationRepository.Translation.ORIGINAL;
        }
        if (i11 == r0.P6) {
            return TranslationRepository.Translation.ARABIC;
        }
        if (i11 == r0.Q6) {
            return TranslationRepository.Translation.ENGLISH;
        }
        String simpleName = TranslationRepository.Translation.class.getSimpleName();
        throw new IllegalAccessException(i11 + " value does not have any corresponding value in " + simpleName + " Enum");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(TranslationRepository.Translation translation, TranslationRepository.Translation translation2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new TranslationViewModel$logAnalytics$1(this, translation, translation2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z0(zz.a<? super TranslationRepository.Translation> aVar) {
        return this.f39136k0.getCurrentTranslation(aVar);
    }

    public final ObservableInt A0() {
        return this.f39137l0;
    }

    public final ObservableBoolean B0() {
        return this.f39138m0;
    }

    public final OneShotEventHandler<p> C0() {
        return this.f39139n0;
    }

    public final void G0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new TranslationViewModel$onOkayClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        this.f39137l0.g(this.f39140o0);
        this.f39136k0.clear();
    }
}
