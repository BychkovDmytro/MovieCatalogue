package com.lokilinks.tablayouttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.lokilinks.tablayouttest.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = MainFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            model.plant.value = PlantModel(R.drawable.roma,"Рома́шка (лат. Matricária) — род многолетних цветковых растений семейства Астровые, или Сложноцветные (Asteraceae), объединяет около двадцати видов невысоких пахучих трав, цветущих с первого года жизни. Наиболее известный вид — Ромашка аптечная (Matricaria chamomilla, syn. Matricaria recutita), это растение широко используется в лечебных и косметических целях.",
                "В медицине и косметологии активно используется ромашка аптечная.\n" +
                    "Высушенную и свежую ромашку аптечную издавна применяют в медицине: (отвары, экстракты) — как противовоспалительное, слабое антисептическое и вяжущее средство, наружно — для полосканий, примочек и ванн. Лечение ромашкой применяется в отношении патологий ЖКТ (желудочно-кишечного тракта), гинекологической сферы, мочеполовой и других систем организма как основная или дополнительная терапия. Ромашка принимается внутрь в виде чая (традиционное английское домашнее средство) или настоя, её используют при спазмах кишечника, метеоризме и диарее, а также как потогонное средство. Препараты — Рекутан, Ротокан.\n" +
                    "\n" +
                    "Ромашка применяется при лечении тревожных расстройств и бессонницы. Однако систематический обзор и метаанализ 2015 года показал неэффективность фитопрепаратов с ромашкой при бессоннице.\n" )

            (activity as AppCompatActivity).supportFragmentManager.beginTransaction().replace(R.id.holder, ContentFragment.newInstance()).commit()

        }

        binding.button2.setOnClickListener {
            model.plant.value = PlantModel(R.drawable.oduv,"Одува́нчик (лат. Taráxacum) — род многолетних травянистых растений семейства Астровые, " +
                    "или Сложноцветные (Asteraceae). Типовой вид рода — Одуванчик лекарственный — хорошо известное растение с розеткой прикорневых листьев " +
                    "и крупными ярко-жёлтыми соцветиями-корзинками из язычковых цветков. В ненастную погоду и на ночь корзинка закрывается.",
                "Употребление в пищу\n" +
                    "С давних времен одуванчики употреблялись в пищу народами. Они были хорошо оценены древними египтянами, грекам и римлянам, " +
                        "и у них были выявлены данные о более поздних медицинских исследованиях. Растение использовалось в качестве еды и лекарств, как коренные американцы, " +
                        "так и первыми поселенцами на Американском континенте. Одуванчики, вероятно, прибыли в Северную Америку на корабле Мейфлауэр как лекарственное растенит.\n" +
                    "Его молодые листья и стебли, содержащие каротиноиды и витамин В2, практически необходимы для приготовления салатов и супов. " +
                        "Зрелые листья перед употреблением вымачивают в подсоленной воде, чтобы убрать горечь.\n" +
                    "Из сушеных корней приготовления «одуванчиковый кофе», из цветков одуванчика варят варенье и делают вино, из раскрывшихся бутонов приготовления «одуванчиковый мёд».\n" +
                    "Корень одуванчика лекарственного (лат. Radix Taraxaci), собирающего осадки до 40 % инулина, применяется в качестве лекарственного растения." +
                        " Сушёный корень воспаления в виде отвара, густого экстракта как горечь для чувствительности секреции пищеварительных желёз и как жёлчегонное средство, " +
                        "укрепляющее и оздоравливающее печень. Настойка корня одуванчика вызывает аппетит, обладает спазмолитическими, ослабляющими и кровоочистительными свойствами.\n")

            (activity as AppCompatActivity).supportFragmentManager.beginTransaction().replace(R.id.holder, ContentFragment.newInstance()).commit()

        }
    }


    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
                }


            }

