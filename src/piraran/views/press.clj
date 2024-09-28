(ns piraran.views.press)

(def images
  (map (fn [img]
         (format "/assets/images/%s.jpeg" img))
       ["IMG_0073"
        "IMG_0077"
        "IMG_0084"
        "IMG_9709"
        "IMG_9714"
        "IMG_9728"
        "IMG_9709"]))

(def statement
  {:en "We believe that in the resonances and hidden folds of this music, there lies a political economy that shapes life through musical imagination or imaginative music. What we aim to foster with our music is a network of mutual aid in which we can rely on each other so that this aural exploration and artistic adventure can be sustainable, autonomous, and committed to the redistribution of attention and the means of perception."
   :es "Creemos que en las resonancias y pliegues ocultos de esta música, yace una economía política que moldea la vida a través de la imaginación musical o la música imaginativa. Lo que buscamos fomentar con nuestra música es una red de ayuda mutua en la que podamos confiar unos en otros para que esta exploración auditiva y aventura artística puedan ser sostenibles, autónomas y comprometidas con la redistribución de la atención y los medios de percepción."})

(def about-piraran
  {:en ["Pirarán is a networked ensemble that combines the sound of analogue and digital synthesizers with live coded soundscapes and dance vectors. They provide (audio)visions of a world beyond the post-end of times. The band is influenced by just-intonation research and poly-temporal music forums, Latin-American popular modernism (Pérez Prado, Cumbia chichadélica, and MicoRex), and music genres like vaporwave, hippie synth music, techno, glitch, industrial, ambient and noise. Pirarán also draws extensively (and expropriates when deemed fit) from ideas, words and visions that give meaning to the music like Mark Fisher, David Graeber, Ursula K. Le Guin, Mario Santiago Papasquiaro, Nancy Fraser, Manuel Maples Arce, Gayatri Spivak and Heriberto Yépez."
        "The band has existed since early 2022 when they recorded Algorithmic Acid Music Vol. 1. Later that year, they released A la vørtex for the label Cjantal in the anthology Nijbla. They also released a video with the live performance of The Phog in its audiovisual form. They have an audiovisual performance featured on the EulerRoom YouTube channel."
        "In 2023, the band released Algorithmic Acid Music Vol. 2 and the single track \"With/out Dancing.\" In 2024, they released La Fábrica Colapsada (The Collapsed Factory), a cyber-opera composed and directed by Pirarán's Alejandro Franco Briones and performed by Pirarán. This piece includes a multichannel music performance and a website created by Pirarán's Diego Villaseñor."
        "Pirarán has performed in Ontario (Canada), Mexico City, Morelia (Mexico), Utrecht (Netherlands), and in a series of networked events simultaneously experienced around the world."
        "Currently Pirarán is promoting La Fábrica Colapsada, this is a 30-minute-long operatic, networked piece made with visuals, multichannel audio, microtonal tuning, polytemporal rhythmic structures, fixed media, reactive algorithmic music in the form of improvisational semi-analogue synthesisers, and live coding accompanied by a website where the storytelling happens asynchronously. The artwork is also constituted by an online repository where the multimedia materials of the opera can be accessed and various pieces of software can be repurposed for geologic seismic data processing of the 2017 earthquake, wavetable synthesis instruments creation, and spatialisation."]
   :es ["Pirarán es un ensamble-red que alucina con ganglios de luz vueltos locos y silencios cojos. Su música ácida algorítmica se mueve equidistante entre la aridez y el vacío del post-fin de los tiempos. La banda está influenciada por foros de afinación justa y música politemporal, el modernismo popular latinoamericano (Pérez Prado, Cumbia chichadélica y MicoRex), y géneros musicales como vaporwave, música hippie synth, techno, glitch, industrial, ambient y noise. Pirarán también se nutre extensamente (y expropia cuando lo considera adecuado) de ideas, palabras y visiones que dan sentido a la música como Mark Fisher, David Graeber, Ursula K. Le Guin, Mario Santiago Papasquiaro, Nancy Fraser, Manuel Maples Arce, Gayatri Spivak y Heriberto Yépez."
        "La banda se formó a principios de 2022 cuando grabaron Algorithmic Acid Music Vol. 1. Más tarde ese año, lanzaron A la vørtex para el sello Cjantal en la antología Nijbla. También lanzaron un video con la actuación en vivo de The Phog en su forma audiovisual. Tienen una actuación audiovisual destacada en el canal de YouTube de EulerRoom."
        "En 2023, la banda lanzó Algorithmic Acid Music Vol. 2 y la pista única \"With/out Dancing.\" En 2024, lanzaron La Fábrica Colapsada, una ciber-ópera compuesta y dirigida por Alejandro Franco Briones de Pirarán e interpretada por Pirarán. Esta pieza incluye una actuación musical multicanal y un sitio web creado por Diego Villaseñor de Pirarán."
        "Pirarán ha actuado en Ontario (Canadá), Ciudad de México, Morelia (México), Utrecht (Países Bajos) y en una serie de eventos en red experimentados simultáneamente en todo el mundo."
        "Actualmente Pirarán está promoviendo La Fábrica Colapsada, esta es una pieza operática en red de 30 minutos de duración hecha con visuales, audio multicanal, afinación microtonal, estructuras rítmicas politemporales, medios fijos, música algorítmica reactiva en forma de sintetizadores semi-analógicos improvisacionales y codificación en vivo acompañada de un sitio web donde la narración ocurre de manera asincrónica. La obra de arte también está constituida por un repositorio en línea donde se pueden acceder a los materiales multimedia de la ópera y varios programas de software pueden ser reutilizados para el procesamiento de datos sísmicos geológicos del terremoto de 2017, la creación de instrumentos de síntesis de tablas de ondas y la espacialización."]})

(defn about-piraran*
  [lang]
  [:section
   [:h2 {:id "about"} (case lang :en "About Pirarán" :es "Sobre Pirarán")]
   [:p {:class "press-kit__statement"} [:quote "\"" (lang statement) "\""]]
   [:img {:style {:max-width "800px"
                  :display "block"
                  :margin "0 auto"}
          :src (nth images 2)}]
   (map (fn [p] [:p p])
        (lang about-piraran))])

(def members
  [{:name "Iván López"
    :location {:en "(Morelia, Mx)" :es "(Morelia, Mx)"}
    :bio {:en "Composer and electronic instrumentalist. His work includes acoustic and electroacoustic music. His creative search extends to fields such as improvisation with electronic/digital media and phonography."
          :es "Compositor e instrumentista electrónico. Su trabajo incluye música acústica y electroacústica. Su búsqueda creativa se extiende a campos como la improvisación con medios electrónicos/digitales y la fonografía."}
    :img "/assets/images/ivan-lopez.jpg"
    :links ["instagram.com/ivan_lo_pi_"]}
   {:name "Diego Villaseñor"
    :location {:en "(Mexico City, Mx)" :es "(Ciudad de México, Mx)"}
    :bio {:en "Composer, improviser, live coder and philosopher. His work is focused on collective creation, modular composition and processes inspired by natural systems."
          :es "Compositor, improvisador, live coder y filósofo. Su trabajo se centra en la creación colectiva, la composición modular y los procesos inspirados en sistemas naturales."}
    :img "/assets/images/diego-villasenor.jpg"
    :links ["echoic.space"
            "youtube.com/@diegovideco"
            "instagram.com/diegovideco"]}
   {:name "Alejandro Franco Briones"
    :location {:en "(Hamilton, Ontario, Canada)" :es "(Hamilton, Ontario, Canada)"}
    :bio {:en "Composer, live coder, sound artist, and scholar from Mexico City. Some of his major interests include time-oriented music, network art ecologies, and musical/technological notational systems."
          :es "Compositor, live coder, artista sonoro y académico de la Ciudad de México. Algunos de sus principales intereses incluyen la música orientada al tiempo, las ecologías artísticas en red y los sistemas de notación musical/tecnológica."}
    :img "/assets/images/alejandro-franco-briones.jpg"
    :links ["afrancob.github.io/sfelfdt"]}])

(defn members*
  [lang]
  [:section
   [:h3 {:id "members"} (case lang :en "Members" :es "Miembros")]
   (map
    (fn [{:keys [name location bio img links]}]
      [:div {:class "press-kit__member"}
       [:h4 name]
       [:small (lang location)]
       [:div {:class "press-kit__member-links"}
        (map (fn [link] [:a {:href (str "https://" link) :target "_blank"} link])
             links)]
       [:img {:src img}]
       [:p (lang bio)]])
    members)])

(def discography
  [{:title {:es "Música Ácida Algorítmica Vol. 1"
            :en  "Algorithmic Acid Music Vol. 1"}
    :href "https://piraran.bandcamp.com/album/algorithmic-acid-music-vol-1"
    :img "/assets/images/aam-vol1.jpg"}
   {:title {:es "A la v​ø​rtex (en compilado Nijbla)"
            :en  "A la v​ø​rtex (in Nijbla compilation"}
    :href "https://cjantal.bandcamp.com/track/a-la-v-rtex"
    :img "/assets/images/nijbla.jpg"}
   {:title {:es "Música Ácida Algorítmica Vol. 2"
            :en  "Algorithmic Acid Music Vol. 2"}
    :href "https://piraran.bandcamp.com/album/algorithmic-acid-music-vol-2"
    :img "/assets/images/aam-vol2.jpg"}
   {:title {:es "With/out Dancing"
            :en  "With/out Dancing"}
    :href "https://piraran.bandcamp.com/track/with-out-dancing"
    :img "/assets/images/without-dancing.jpg"}
   {:title {:es "La Fábrica Colapsada"
            :en "La Fábrica Colapsada (The Colapsed Factory"}
    :href "https://lfc.piraran.com"
    :img "/assets/images/la-fabrica-colapsada.jpg"}])

(defn discography*
  [lang]
  [:section
   [:h2 {:id "discography"} (case lang :en "Discography" :es "Discografía")]
   [:div {:class "discography"}
    (map (fn [{:keys [title href img]}]
           [:div {:class "discography__album"}
            [:a {:href href :target "_blank"}
             [:h3 (lang title)]
             [:img {:src img :alt (lang title)}]]])
         discography)]])

(def videos
  [{:title {:en "Live at the Phog (Windsor, Ontario, CA) 16/11/22"
            :es "En vivo en el Phog (Windsor, Ontario, CA) 16/11/22"}
    :youtube-id "ayE-mxsTJG0"}
   {:title {:es "Música Ácida Algorítmica (MAA) Vol. 1"
            :en "Algorithmic Acid Music Vol. 1"}
    :youtube-id "Z3y0eb7BsFU"}])

(defn videography*
  [lang]
  [:section
   [:h2 {:id "videography"} (case lang :en "Videography" :es "Videografía")]
   [:div {:class "videography"}
    (map (fn [{:keys [title youtube-id]}]
           [:div {:class "videography__video"}
            [:h3 (lang title)]
            [:iframe
             {:width "560",
              :height "315",
              :src (str "https://www.youtube.com/embed/" youtube-id),
              :title "YouTube video player",
              :frameborder "0",
              :allow "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share",
              :referrerpolicy "strict-origin-when-cross-origin",
              :allowfullscreen true}]])
         videos)]])

(defn images*
  [lang]
  [:section
   [:h2 {:id "images"} (case lang :en "Images" :es "Imágenes")]
   [:div {:class "images"}
    (map (fn [src]
           [:img {:class "press-kit__band-img"
                  :src src}])
         images)]])

(def external-links
  [{:name "Bandcamp" :href "https://piraran.bandcamp.com"}
   {:name "Youtube" :href "https://www.youtube.com/@piraran"}
   {:name "Instagram" :href "https://www.instagram.com/piraran.ensamble/"}
   {:name "LinkTree" :href "https://linktr.ee/piraran"}])

(defn external-links*
  [lang]
  [:section
   [:h2 {:id "external-links"} (case lang :en "External Links" :es "Vínculos Externos")]
   [:div {:class "press-kit__external-links"}
    (map
     (fn [{:keys [name href]}]
       [:p [:a {:href href :target "_blank"} name]])
     external-links)]])

(defn contact-info
  [lang]
  [:section
   [:h2 {:id "contact-info"} (case lang :en "Contact" :es "Contacto")]
   [:div {:class "press-kit__contact-information"}
    [:a {:href "mailto:piraran.ensamble@gmail.com"}  "piraran.ensamble@gmail.com"]]])

(defn menu
  [lang]
  [:nav {:class "press-kit__menu"}
   [:ul
    [:li [:a {:href "#about"} (case lang :en "About Pirarán" :es "Sobre Pirarán")]]
    [:li [:a {:href "#members"} (case lang :en "Members" :es "Miembros")]]
    [:li [:a {:href "#discography"} (case lang :en "Discography" :es "Discografía")]]
    [:li [:a {:href "#videography"} (case lang :en "Videography" :es "Videografía")]]
    [:li [:a {:href "#images"} (case lang :en "Images" :es "Imágenes")]]
    [:li [:a {:href "#external-links"} (case lang :en "External Links" :es "Vínculos Externos")]]
    [:li [:a {:href "#contact-info"} (case lang :en "Contact" :es "Contacto")]]]])

(defn main
  [{:keys [lang]}]
  [:html
   (let [title (format "Pirarán | %s"
                       (case lang :en "Press Kit" :es "Kit de Prensa"))]
     [:head
      [:title title]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
      [:meta {:property "og:title", :content title}]
      [:meta
       {:property "og:description",
        :content (case lang
                   :en "Pirarán's press information: bio, discography, videos, images, and links."
                   :es "Información para la prensa sobre Pirarán: biografía, discografía, videos, imágenes y links.")}]
      [:meta {:property "og:image", :content "assets/images/seo.jpg"}]
      [:meta {:property "og:image:width", :content "1200"}]
      [:meta {:property "og:image:height", :content "1021"}]
      [:link {:rel "stylesheet" :href "/css/styles.css"}]])
   [:body
    [:div {:class "press-kit"}
     [:div {:class "main-container"}
      [:h1 (case lang :en "Press Kit" :es "Kit de Prensa")]
      (menu lang)
      (about-piraran* lang)
      (discography* lang)
      (external-links* lang)
      (videography* lang)
      (images* lang)
      (members* lang)
      (contact-info lang)]]]])

(comment)
(piraran.build/compile-press-page :es)
(piraran.build/compile-press-page :en)
